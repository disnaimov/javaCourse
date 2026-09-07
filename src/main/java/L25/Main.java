package L25;

class NeMyasoException extends RuntimeException {
    NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends NeMyasoException {

    NeVodaException(String message) {
        super(message);
    }
}

class Tiger {
    void eat(String food) {
        if(!food.equals("myaso")) {
            throw new NeMyasoException("Tiger doesn't eat" + food);
        }

        System.out.println("Tiger eats " + food);
    }

    void drink(String someDrink) {
        if (!someDrink.equals("voda")) {
            throw new NeVodaException("Tiger doesn't drink " + someDrink);
        }

        System.out.println("Tiger drinks " + someDrink);
    }
}
public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");

        try {
            try {
                tiger.drink("pivo"); // Выбросит NeVodaException
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }

            tiger.drink("voda");

        } catch (NeVodaException e) {
            // Этот блок не сработает, так как NeVodaException уже обработан во внутреннем catch.
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
