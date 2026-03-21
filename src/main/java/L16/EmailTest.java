package L16;

public class EmailTest {
    private static void email(String emails) {
        StringBuilder result = new StringBuilder();
        char[] emailsChars = emails.toCharArray();

        for (char emailsChar : emailsChars) {
            if (emailsChar == '@') {
                result = new StringBuilder();
                continue;
            }

            if (emailsChar == '.') {
                System.out.println(result);
                result = new StringBuilder();
                continue;
            }

            result.append(emailsChar);
        }
    }

    public static void main(String[] args) {
        String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(emails);
    }
}

