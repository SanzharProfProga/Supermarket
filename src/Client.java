import java.math.BigDecimal;

public class Client implements CardInterface {
    private String firstName;
    private String lastName;
    private byte age;
    private Card card;
    private Basket basket;

    public Client(String firstName, String lastName, byte age, Card card, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getCheck(){
        if (basket.GetPriceProduct() >= 100){
            return "Введите пароль";
        }
        return "";
    }

    @Override
    public BigDecimal payWithCard() {
        return null;
    }

    @Override
    public BigDecimal cardBalance() {
        return null;
    }
}
