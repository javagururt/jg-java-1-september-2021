class Praktikum {
    public static void main(String[] args) {
        double rateUSD = 78.5;
        double rateEUR = 86.5;
        double rubles = 14560.5;
        String currency = "EUR";
        System.out.println("Вы конвертируете рубли в " + currency);
        if (currency.equals("USD")) { // Если currency равно "USD", то конвертируем в доллары, иначе в евро
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        }
    }
}