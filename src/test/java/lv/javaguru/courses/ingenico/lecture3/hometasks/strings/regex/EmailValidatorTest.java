package lv.javaguru.courses.ingenico.lecture3.hometasks.strings.regex;

import org.junit.Test;

public class EmailValidatorTest {

    private EmailValidator validator = new EmailValidator();

    @Test
    public void shouldNotThrowExceptionOnValidEmails() throws Exception {
        validator.validate("simple@example");
        validator.validate("simple@example.com");
        validator.validate("very.common@example.com");
        validator.validate("very_common@example.com");
        validator.validate("very_common@example.com");
        validator.validate("disposable.style.email@example.com");
        validator.validate("other12.email_with-all.characters09@example.com");
        validator.validate("x@example.com");
        validator.validate("1@example.com");
        validator.validate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com");
        validator.validate("email@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    // LOCAL PART
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartStartsWithDot() throws Exception {
        validator.validate(".email@example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartEndsWithDot() throws Exception {
        validator.validate("email.@example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartStartsWithHyphen() throws Exception {
        validator.validate("_email@example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartEndsWithHyphen() throws Exception {
        validator.validate("email_@example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartEndsWithHyphenMinus() throws Exception {
        validator.validate("email-@example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartStartsWithHyphenMinus() throws Exception {
        validator.validate("-email@example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLocalPartMoreThen100Symbols() throws Exception {
        // 101 symbol
        validator.validate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com");
    }

    // DOMAIN
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfDomainStartsWithDot() throws Exception {
        validator.validate("email@.example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfDomainEndsWithDot() throws Exception {
        validator.validate("email@example.com.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfDomainStartsWithHyphen() throws Exception {
        validator.validate("email@_example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfDomainEndsWithHyphen() throws Exception {
        validator.validate("email@example.com_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfDomainEndsWithHyphenMinus() throws Exception {
        validator.validate("email@-example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfDomainStartsWithHyphenMinus() throws Exception {
        validator.validate("email@example.com-");
    }

    @Test
    public void shouldThrowExceptionIfDomainMoreThan100Symbols() throws Exception {
        //104 symbols
        validator.validate("email@aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.com");
    }
}