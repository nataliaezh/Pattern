package ru.geekbrains.pattern.Lesson6.soap;

import com.soap.test_soap.entities.Customer;
import com.soap.test_soap.soap.catalog.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Endpoint
public class CatalogEndpoint<stopDate> {
    private static final String CATALOG_NAMESPACE_URI = "http://www.test_soap.soap.com/soap/catalog";

    private SoapCatalogService soapCatalogService;

    @Autowired
    public void setSoapCatalogService(SoapCatalogService soapCatalogService) {
        this.soapCatalogService = soapCatalogService;
    }
    @PayloadRoot(namespace = CATALOG_NAMESPACE_URI, localPart = "getMonthPurchaseItemRequest")
    @ResponsePayload
    public GetMonthPurchaseItemRequest" getMonthPurchaseItemRequest"(LocalDate startDate, LocalDate stopDate) {
        GetWeekTimeCustomerResponse response = new GetWeekTimeCustomerResponse();
        MonthPurchaseItem monthPurchaseItem= new MonthPurchaseItem();
        startDate=LocalDate.parse("2019-04-25");
        stopDate=LocalDate.parse("2019-05-25");

        List<Customer> customerWeekTimeList = soapCatalogService.findAllByTimeBetween(startDate,stopDate);
        for (int i = 0; i < customerWeekTimeList.size(); i++) {
            CustomerWeekInfo ob = new CustomerWeekInfo();
            BeanUtils.copyProperties(customerWeekTimeList.get(i), ob);
            customerWeekInfoList.add(ob);
        }
        response.getCustomerWeekInfo().addAll(customerWeekInfoList);
        return response;
    }


