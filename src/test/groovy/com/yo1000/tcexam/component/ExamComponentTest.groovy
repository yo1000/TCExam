package com.yo1000.tcexam.component
import com.yo1000.tcexam.TCExamApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
/**
 * Created by yoichi.kikuchi on 2015/10/16.
 */
@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = [TCExamApplication])
@WebIntegrationTest(["server.port=0"])
class ExamComponentTest {
    @Test
    def "divTest"() {
        def exam = new ExamComponent()

        assert 1 == exam.div(1, 1);
        assert 2 == exam.div(2, 1);
    }
}
