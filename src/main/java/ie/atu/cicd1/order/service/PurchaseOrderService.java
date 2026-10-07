package ie.atu.cicd1.order.service;

import ie.atu.cicd1.order.client.dto.ProductResponse;
import ie.atu.cicd1.order.model.PurchaseOrder;
import ie.atu.cicd1.order.model.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import ie.atu.cicd1.order.client.CatalogClient;

import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository purchaseOrderRepository;
    private final CatalogClient catalogClient;

    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository, CatalogClient catalogClient) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder order) {
        return purchaseOrderRepository.save(order);
    }
    public ProductResponse testCatalogConnection(Long productId) {
        return catalogClient.getProductById(productId);
    }
}