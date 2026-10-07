package ie.atu.cicd1.order.controller;

import ie.atu.cicd1.order.client.dto.ProductResponse;
import ie.atu.cicd1.order.model.PurchaseOrder;
import ie.atu.cicd1.order.service.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {

    private final PurchaseOrderService service;

    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<PurchaseOrder> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrder create(@RequestBody PurchaseOrder order) {
        return service.create(order);
    }

    @GetMapping("/test-catalog/{productId}")
    public ProductResponse testCatalog(@PathVariable Long productId) {
        return service.testCatalogConnection(productId);
    }

    @GetMapping("/{id}/product")
    public ProductResponse getProductForOrder(@PathVariable Long id) {
        return service.getProductForOrder(id);
    }
}