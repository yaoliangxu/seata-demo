package com.dcits.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 虎哥
 */
@FeignClient("account-service")
public interface AccountClient {

    @PostMapping("/account/{userId}/{money}")
    void deduct(@PathVariable String userId, @PathVariable Integer money);
}
