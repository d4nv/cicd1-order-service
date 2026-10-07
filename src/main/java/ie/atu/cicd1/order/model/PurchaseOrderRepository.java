package ie.atu.cicd1.order.model;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
}