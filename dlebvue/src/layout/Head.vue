<template>
  <div id="header">
    <header>
      <div class="admin-logo">
      </div>
      <div class="admin-header-user">
        <span>{{userName}} 欢迎登录</span>
        <button style="color:#ea1d24" type="button" name="button" @click="signOut">退出</button>
      </div>
    </header>
    <transition name="el-zoom-in-top">
      <div v-show="isshow" class="transition-box">
        <div class="transition-content">
          <el-menu v-if="isshow" transiton="fade"
                   :default-active="defaultActive"
                   class="admin-menu"
                   background-color="#36404a"
                   text-color="#ccc"
                   active-text-color="#ffd04b" router>
            <el-menu-item  index="/BusinessMemberList">
              <i class="el-icon-menu"></i>
              <span slot="title">会员管理</span>
            </el-menu-item>

            <el-menu-item  index="/OrderManageList">
              <i class="el-icon-menu"></i>
              <span slot="title">物流管理</span>
            </el-menu-item>
            <el-menu-item  index="/NoticeManageList">
              <i class="el-icon-menu"></i>
              <span slot="title">公告信息</span>
            </el-menu-item>
            <el-submenu index="3">
              <template slot="title">
                <i class="el-icon-setting"></i>
                <span slot="title">系统设置</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="/UserMemberList">用户管理</el-menu-item>
                <el-menu-item index="/PersonalCenter">个人中心</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
        </div>
      </div>

    </transition>

  </div>

</template>


<script>
  import api from '@/api/fetch'
  import * as Message from '../utils/messageUtil'
  import _ from 'lodash'

  export default {
    name: 'Head',
    data() {
      return {
        isshow: true,
        userName: this.$root.$data.user.userName,
        resourceList: [],
        routerIsAlive: [],
        defaultActive: ''
    }
    },
    methods: {
      getData() {
        api.get('/user/getResource').then((response) => {
          if (response.data.code === 1) {
            this.resourceList = response.data.data
            var routerList = this.$router.options.routes[1].children
            for (var i = 0; i < this.resourceList.length; i++) {
              for (var j = 0; j < routerList.length; j++) {
                if (this.resourceList[i].resourceName === routerList[j].name) {
                  routerList[j].meta.show = true
                }
              }
            }
          } else {
            Message.MessageError(response.data.msg)
          }
        });
      },
      signOut() {
        this.$http.get('/user/loginOut?token='+sessionStorage.getItem('dleb_token')).then((response) => {
          if (response.data.code === 1) {
            sessionStorage.removeItem('dleb_token');
            sessionStorage.removeItem('dleb_user');
            for(var i=0;i<this.routerIsAlive.length;i++){
              this.routerIsAlive[i].meta.show = false;
            }
            this.$router.push('/AdminLogin')
          } else {
            Message.MessageError(response.data.msg)
          }
        });
      },
      getDefaultActive() {
        let path = this.$route.path
        console.log(path);
        let result = ''
        let pathList = [ '/BusinessMemberList', '/OrderManageList', '/NoticeManageList',
           '/UserMemberList',  '/PersonalCenter']
        _.forEach(pathList, function (value) {
          if (_.startsWith(path, value)) {
            result = value
            return
          }
        });
        this.defaultActive = result
      }
    },
    created() {
      this.routerIsAlive = this.$router.options.routes[1].children

      for(var i=0;i<this.routerIsAlive.length;i++){
          console.log(i+"::::"+this.routerIsAlive[i].name+  "  "+this.routerIsAlive[i].path +" "+this.routerIsAlive[i].meta.show);
      }
      this.getData()
      this.getDefaultActive();
    },
    watch: {
      '$route'(to, from) {
        this.getDefaultActive()
      }
    }
  }
</script>

<style scoped>
  header {
    height: 60px;
    width: 100%;
    line-height: 60px;
    background-color: #fff;
    position: fixed;
    top: 0;
    left: 0;
    z-index: 999;
  }

  header .admin-logo {
    background-color: rgb(54, 64, 74);
    width: 208px;
    height: 100%;
    float: left;
    box-sizing: border-box;
    padding-left: 25px;
  }

  header .admin-logo img {
    height: 34px;
  }

  .admin-header-user {
    float: right;
  }

  .admin-header-user * {
    margin-right: 30px;
  }

  .transition-box {
    width: 210px;
    box-sizing: border-box;
    height: 100%;
    position: fixed;
    top: 0;
    left: 0;
    transition: 1s;
    background: #36404a;
    z-index: 555;
    overflow: hidden;
  }

  .transition-content {
    width: 225px;
    padding-right: 30px;
    height: 100%;
    overflow-x: hidden;
    overflow-y: scroll;
  }

  .transition-box .el-menu {
    height: auto;
    width: 210px;
    height: auto;
    padding: 70px 0;
  }

  .transition-content .el-submenu ul li ul li.el-menu-item {
    background-color: #272f38 !important;
    padding-left: 60px !important;
    transition: .5s;
    color: #999 !important;
  }

  .transition-content .el-submenu ul li ul li.el-menu-item:hover {
    background-color: #1d2329 !important;
    padding-left: 80px !important;
    transition: .5s;
    color: #009afe !important;
  }

</style>
