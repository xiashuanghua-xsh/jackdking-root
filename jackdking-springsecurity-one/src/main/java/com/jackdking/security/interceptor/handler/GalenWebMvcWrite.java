package com.jackdking.security.interceptor.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackdking.security.pojo.RespBean;

/**
 * @Author: Galen
 * @Date: 2019/3/28-9:31
 * @Description: 页面信息
 **/
public class GalenWebMvcWrite {
    /**
     * @Author: Galen
     * @Description: 输出信息到页面
     * @Date: 2019/3/28-9:35
     * @Param: [response, respBean]
     * @return: void
     **/
    public void writeToWeb(HttpServletResponse response, RespBean respBean) throws IOException {
        ObjectMapper om = new ObjectMapper();
        PrintWriter out = response.getWriter();
        out.write(om.writeValueAsString(respBean));
        out.flush();
        out.close();
    }
}
