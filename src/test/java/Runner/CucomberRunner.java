

package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/j_page_korbo_setar_type_er_nam.feature"},
        glue = {"StepDefination"},   monochrome = true,
        dryRun = false,
plugin ={ "pretty","html:build/reportss/accountManagerJourney.html"
        })

@Test
class CucomberRunner extends AbstractTestNGCucumberTests{
        }
