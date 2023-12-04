package com.dcits.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 虎哥
 */
@FeignClient("storage-service")
public interface StorageClient {
    @PostMapping("/storage/{code}/{count}")
    void deduct(@PathVariable String code, @PathVariable Integer count);
}
