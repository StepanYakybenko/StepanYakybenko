package MtsTests;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class MtsTestAdd {
    private static final String PLACEHOLDERS_MESSAGE = "Заполнитель не соответствует ожидаемому.";
    private static final String CURRENT_SERVICE_MESSAGE = "Текущий сервис не соответствует ожидаемому.";

    @Test
    @Description("Проверить надписи в незаполненных полях сервиса 'Услуги связи'")
    @DisplayName("Тест надписей для услуг связи")
    public void testPlaceholdersForConnection() {
        String service = "Услуги связи";
        MtsHomePageAdd.selectService(service);

        assertAll("Проверки заполнителей для услуг связи.",
                () -> assertEquals(service, MtsHomePageAdd.getCurrentService(), CURRENT_SERVICE_MESSAGE),
                () -> assertEquals("Номер телефона", MtsHomePageAdd.getConnectionPhonePlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("Сумма", MtsHomePageAdd.getConnectionSumPlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("E-mail для отправки чека", MtsHomePageAdd.getConnectionEmailPlaceholder(), PLACEHOLDERS_MESSAGE)
        );
    }

    @Test
    @Description("Проверить надписи в незаполненных полях сервиса 'Домашний интернет'")
    @DisplayName("Тест надписей для домашнего интернета")
    public void testPlaceholdersForInternet() {
        String service = "Домашний интернет";
        MtsHomePageAdd.selectService(service);

        assertAll("Проверки заполнителей для домашнего интернета.",
                () -> assertEquals(service, MtsHomePageAdd.getCurrentService(), CURRENT_SERVICE_MESSAGE),
                () -> assertEquals("Номер абонента", MtsHomePageAdd.getInternetPhonePlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("Сумма", MtsHomePageAdd.getInternetSumPlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("E-mail для отправки чека", MtsHomePageAdd.getInternetEmailPlaceholder(), PLACEHOLDERS_MESSAGE)
        );
    }

    @Test
    @Description("Проверить надписи в незаполненных полях сервиса 'Рассрочка'")
    @DisplayName("Тест надписей для рассрочки")
    public void testPlaceholdersForInstalment() {
        String service = "Рассрочка";
        MtsHomePageAdd.selectService(service);

        assertAll("Проверки заполнителей для рассрочки.",
                () -> assertEquals(service, MtsHomePageAdd.getCurrentService(), CURRENT_SERVICE_MESSAGE),
                () -> assertEquals("Номер счета на 44", MtsHomePageAdd.getScoreInstalmentPlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("Сумма", MtsHomePageAdd.getInstalmentSumPlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("E-mail для отправки чека", MtsHomePageAdd.getInstalmentEmailPlaceholder(), PLACEHOLDERS_MESSAGE)
        );
    }

    @Test
    @Description("Проверить надписи в незаполненных полях сервиса 'Задолженность'")
    @DisplayName("Тест надписей для задолженности")
    public void testPlaceholdersForArrears() {
        String service = "Задолженность";
        MtsHomePageAdd.selectService(service);

        assertAll("Проверки заполнителей для задолженности.",
                () -> assertEquals(service, MtsHomePageAdd.getCurrentService(), CURRENT_SERVICE_MESSAGE),
                () -> assertEquals("Номер счета на 2073", MtsHomePageAdd.getScoreArrearsPlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("Сумма", MtsHomePageAdd.getArrearsSumPlaceholder(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("E-mail для отправки чека", MtsHomePageAdd.getArrearsEmailPlaceholder(), PLACEHOLDERS_MESSAGE)
        );
    }

    @Test
    @Description("В окне оплаты проверить корректность отображения суммы (в том числе на кнопке), номера телефона, " +
            "а также надписей в незаполненных полях для ввода реквизитов карты, наличие иконок платёжных систем")
    @DisplayName("Тест окна оплаты")
    public void testBePaidApp() {
        String phoneNumber = "297777777";
        String amount = "15.50";
        MtsHomePageAdd.enterDataForConnection(phoneNumber, amount);

        assertAll("Проверки для окна оплаты.",
                () -> assertTrue(MtsHomePageAdd.isBePaidIframeDisplayed(), "Окно для оплаты не отображается."),
                () -> assertTrue(MtsHomePageAdd.getBePaidAmount().contains(amount), "Сумма не соответствует ожидаемой."),
                () -> assertTrue(MtsHomePageAdd.getBePaidDescription().contains(phoneNumber), "Телефон не соответствует ожидаемому."),
                () -> assertTrue(MtsHomePageAdd.getBePaidButtonText().contains(amount), "Сумма на кнопке не соответствует ожидаемой."),
                () -> assertEquals("Номер карты", MtsHomePageAdd.getBePaidCardInputText(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("Срок действия", MtsHomePageAdd.getBePaidValidityCardText(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("CVC", MtsHomePageAdd.getBePaidCvcCardText(), PLACEHOLDERS_MESSAGE),
                () -> assertEquals("Имя держателя (как на карте)", MtsHomePageAdd.getBePaidCardholderNameText(), PLACEHOLDERS_MESSAGE),
                () -> assertTrue(MtsHomePageAdd.isBePaidVisaIconDisplayed(), "Иконка Visa не отображается."),
                () -> assertTrue(MtsHomePageAdd.isBePaidMastercardIconDisplayed(), "Иконка Mastercard не отображается."),
                () -> assertTrue(MtsHomePageAdd.isBePaidBelkartIconDisplayed(), "Иконка Belkart не отображается."),
                () -> assertTrue(MtsHomePageAdd.isBePaidMaestroIconDisplayed(), "Иконка Maestro не отображается."),
                () -> assertTrue(MtsHomePageAdd.isBePaidMirIconDisplayed(), "Иконка Mir не отображается.")
        );
    }
}
