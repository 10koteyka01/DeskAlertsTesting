import ru.yandex.qatools.allure.annotations.Step;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTestSuite {



    @Test

    public void failingTest() {
        assertThat(1, equalTo(2));
    }

    @Test
    public void successfulTest() {
        firstStep();
    }

    @Step
    private void firstStep() {
        secondStep();
    }

    @Step
    private void secondStep() {

    }
}
