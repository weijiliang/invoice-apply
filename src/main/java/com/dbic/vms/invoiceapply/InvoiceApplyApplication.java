package com.dbic.vms.invoiceapply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InvoiceApplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceApplyApplication.class, args);
    }
}
