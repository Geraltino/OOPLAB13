package ie.atu.productv3;

import ie.atu.productv3.Book;
import ie.atu.productv3.Software;

public class ProductDB {


    public static Product getProduct(String productCode) {

        Product myProduct = null;

        ie.atu.productv3.Software mySoftware = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new ie.atu.productv3.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        ie.atu.productv3.Book myBook = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;

        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new ie.atu.productv3.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

        return myProduct;
    }
}

