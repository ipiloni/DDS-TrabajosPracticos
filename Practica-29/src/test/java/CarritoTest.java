import org.junit.Assert;
import org.junit.Test;


import java.time.LocalDate;

public class CarritoTest {
    LocalDate unDia = LocalDate.now();
    TarjetaDeCredito unaTarjeta = new TarjetaDeCredito("123",unDia,"vero","456");
    Cliente unCliente = new Cliente("vero","garcia","mail",unaTarjeta);
    CarritoDeCompras unCarrito = new CarritoDeCompras();

    Producto arroz = new Producto("1","",100.00);
    Producto agua = new Producto("2","",200.00);
    Producto oreos = new Producto("3","",300.00);

    Item item1 = new Item(arroz,1);
    Item item2 = new Item(agua,3);
    Item item3 = new Item(oreos,2);

    @Test
    public void calculaPrecioCarrito(){
        unCarrito.setCliente(unCliente);
        unCliente.agregarCarrito(unCarrito);
        unCarrito.agregarItem(item1);
        unCarrito.agregarItem(item2);
        unCarrito.agregarItem(item3);

        Assert.assertEquals(1300.00,unCarrito.precioCarrito().doubleValue(),0.0);
    }
}