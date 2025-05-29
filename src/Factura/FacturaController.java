package Factura;

import java.util.List;

public class FacturaController {
    private FacturaDAO dao = new FacturaDAO();

    public List<OrdenFactura> getOrdenesMesa(int noMesa) {
        return dao.obtenerOrdenesPorMesa(noMesa);
    }
}
