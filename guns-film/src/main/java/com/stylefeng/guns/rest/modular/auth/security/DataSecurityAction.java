package com.stylefeng.guns.rest.modular.auth.security;

/**
 * <pre>
 * 信息传递的保护措施(传递的数据为json)
 *
 * 说明:
 * 可以根据实际开发时的需要,编写自己的数据加密方案,只需实现此类,并在WebConfig下配置您所编写的实现类即可
 * </pre>
 *
 */
public interface DataSecurityAction {

    /**
     * 执行数据的保护措施
     */
    String doAction(String beProtected);

    /**
     * 解除保护
     */
    String unlock(String securityCode);
}
