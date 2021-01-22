import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationCheck {

    @ParameterizedTest
    @MethodSource
    @DisplayName("Tests the aggregations of tests")
    public void testAllMethods (String word, boolean expected) {
    boolean result = PasswordValidation.amalgamateTests(word);
    assertEquals(expected, result);
    }

    private static Stream<Arguments> testAllMethods(){
        return Stream.of(
                Arguments.of("monkey", false),
                Arguments.of("Animals", false),
                Arguments.of("444animals", false),
                Arguments.of("444ELEPHANT", false),
                Arguments.of("do3948nKey", true)
        );
    }

}
