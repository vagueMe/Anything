package com.test.framework.utils;

import com.test.framework.enums.ApiCodeEnum;
import com.test.framework.model.ApiResult;

/**
 * Created by hugo on 2017/10/15.
 */
public class ApiResultUtil {

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<T>(ApiCodeEnum.SUCCESS.getCode(), ApiCodeEnum.SUCCESS.getMessage(), data);
    }

    public static <T> ApiResult<T> error(String msg) {
        return new ApiResult<T>(ApiCodeEnum.FAILURE.getCode(), msg);
    }
}