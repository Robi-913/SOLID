package solid.o;

import solid.o.bad.AnotherBadClient;
import solid.o.bad.BadClient;
import solid.o.bad.BadServer;
import solid.o.good.AnotherGoodClient;
import solid.o.good.Client_I;
import solid.o.good.GoodClient;
import solid.o.good.GoodServer;

public class OMain {

    public static void main(String[] args) {
        testBadO();
        testGoodO();
    }

    private static void testBadO() {
        BadClient client = new BadClient();
        BadServer server = new BadServer();
        server.reactToClient(client);

        AnotherBadClient anotherBadClient = new AnotherBadClient();
//        server.reactToClient(anotherBadClient);


    }

    private static void testGoodO() {
        Client_I client = new GoodClient();
        GoodServer server = new GoodServer();
        server.reactToClient(client);

        AnotherGoodClient anotherGoodClient = new AnotherGoodClient();
        server.reactToClient(anotherGoodClient);
    }

}