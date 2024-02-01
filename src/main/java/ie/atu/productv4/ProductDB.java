package ie.atu.productv4;

public class ProductDB {


    public static Product getProduct(String productCode) {

        Product myProduct = null;

        Software mySoftware = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        Book myBook = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;

        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

        Tv myTV = null;
        if (productCode.equalsIgnoreCase("kdl43")) {
            myTV = new ie.atu.productv4.Tv();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV DKL43WF663");
            myTV.setPrice(819.00);
            myTV.setManufacture("Sony");
            myTV.setscreensize("Screen size is 55'");
            myProduct = myTV;
        }
        if (productCode.equalsIgnoreCase("43LV")) {
            myTV = new ie.atu.productv4.Tv();
            myTV.setCode(productCode);
            myTV.setDescription("TOSHIBA 43LV2E63DB SMART FULL HD TV");
            myTV.setPrice(249.00);
            myTV.setManufacture("Toshiba");
            myTV.setscreensize("Screen size is 43'");
            myProduct = myTV;
        }
        if (productCode.equalsIgnoreCase("UE43")) {
            myTV = new ie.atu.productv4.Tv();
            myTV.setCode(productCode);
            myTV.setDescription("SAMSUNG UE43CU7100KXXU Smart 4K Ultra HD HDR LED TV");
            myTV.setPrice(399.00);
            myTV.setManufacture("Samsung");
            myTV.setscreensize("Screen size is 43'");
            myProduct = myTV;
        }

        Music myMusic = null;
        if (productCode.equalsIgnoreCase("Circles")) {
            myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Released on August 30, 2019");
            myMusic.setPrice(5.00);
            myMusic.setArtist("Post Malone");
            myMusic.setLabel("Republic Records label");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("I can be your angle, or yuor devil")) {
            myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Released in 2021 as a single");
            myMusic.setPrice(5.00);
            myMusic.setArtist("Istasha");
            myMusic.setLabel("N/A");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("Alfred's Theme")) {
            myMusic = new ie.atu.productv4.Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Released on Decemeber 18, 2020");
            myMusic.setPrice(5.00);
            myMusic.setArtist("Eminem");
            myMusic.setLabel("through Shady Records, Aftermath Entertainment, and Interscope Records labels");
            myProduct = myMusic;
        }


        return myProduct;
    }
}

