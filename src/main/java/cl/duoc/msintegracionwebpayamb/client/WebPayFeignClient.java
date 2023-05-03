package cl.duoc.msintegracionwebpayamb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cl.duoc.msintegracionwebpayamb.model.WebPayInitTransactionDTO;

@FeignClient(name = "svc-webpay-api", url = "https://webpay3gint.transbank.cl/rswebpaytransaction/api/webpay/v1.2")
public interface WebPayFeignClient {

    @PostMapping(path = "/transactions", produces = {"application/json"})
    public String createTransaction(@RequestHeader("Tbk-Api-Key-Id") String tbkApiKeyId,
                                    @RequestHeader("Tbk-Api-Key-Secret") String tbkApiKeySecret,
                                    @RequestBody WebPayInitTransactionDTO WebPayInitTransactionDTO);
    
}
