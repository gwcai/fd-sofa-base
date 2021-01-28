package com.fudianbank.base.rpc.filter;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.alipay.sofa.rpc.core.exception.RpcErrorType;
import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.core.response.SofaResponse;
import com.alipay.sofa.rpc.ext.Extension;
import com.alipay.sofa.rpc.filter.*;
import com.alipay.sofa.rpc.log.Logger;
import com.alipay.sofa.rpc.log.LoggerFactory;
import com.fudianbank.base.exception.FdRuntimeException;
import com.fudianbank.base.rpc.utils.RpcUtil;

/***
 * @Author: gaoweicai
 * @Date: 2021/1/27 11:30
 * @Description: SOFARPC自定义过滤器
 */
@Extension(value = "sofaRpcFilter", order = -10000)
@AutoActive(providerSide = true,consumerSide = true)
public class SofaRpcFilter extends Filter {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(SofaRpcFilter.class);

    @Override
    public SofaResponse invoke(FilterInvoker invoker, SofaRequest sofaRequest) throws SofaRpcException {
        SofaResponse response = new SofaResponse();
        try {
            response = invoker.invoke(sofaRequest);
            if (response.getAppResponse() instanceof FdRuntimeException) {
                FdRuntimeException exception = (FdRuntimeException) response.getAppResponse();
                LOGGER.error("rpc call failed:{}", exception.getMessage());
                RpcUtil.setFailResMessageHead(exception);
            }
        }catch (Exception ex){

        }

        return response;
    }

    @Override
    public void onAsyncResponse(ConsumerConfig config, SofaRequest request, SofaResponse response, Throwable exception) throws SofaRpcException {
        super.onAsyncResponse(config, request, response, exception);
    }
}
