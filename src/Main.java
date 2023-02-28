import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Product product = new Product("Apple", new BigDecimal(150));
        Product product1 = new Product("Orange", new BigDecimal(180));
        Product product2 = new Product("Banana", new BigDecimal(150));
        Product product3 = new Product("Meat", new BigDecimal(550));
        Product product4 = new Product("Eggs", new BigDecimal(110));
        Product product5 = new Product("Watermelon", new BigDecimal(70));
        Product product6 = new Product("Kiwi", new BigDecimal(170));
        Product[] products = {product, product1, product2, product3, product4, product5, product6};



        Card card = new Card("Sanzhar","Abdymomunov",4756136479439724L,
                new BigDecimal(2000000),(short) 1975);

        Basket basket = new Basket(products);

        Client client = new Client("Sanzhar","Abdymomunov",(byte)19,card,basket);


        byte bye = new Scanner(System.in).nextByte();


      /*  представьте что вы пришли в супермаркет и совершаете покупку,
                расплачиваетесь картой, если сумма на продукты превышает 100 сом у вас
        запрашивается пароль, при вводе, пароль проверяется и если он не верный,
        на консоль выводится "не верный пароль", а если же он верный вы можете
        продолжать операцию. если у вас достаточно средств вы оплачиваете и на
        консоли вы можете увидеть чек (с названиями и ценами на продукты и ощую
                сумму на них), а если нет на консоль выводится "у вас не хватает средств"*/





    }
}