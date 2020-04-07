package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(2) == "2")
        }

        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(2) == "2")
        }

        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(2) == "2")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(21, 2, 5)) == 21)
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max1(Seq()) == -1)
        }

        'test_max2 - {
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max1(Seq(4, 5, 6)) == 6)
            assert(Exercises.max1(Seq()) == List())
        }

        'test_max3 - {
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max1(Seq(4, 5, 6)) == 6)
            assert(Exercises.max1(Seq()) == None)
        }

        'test_sum1 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(3, 4) == 7)
            assert(Exercises.sum1(15, 15) == 30)
        }

        'test_sum2 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(37, 63) == 100)
            assert(Exercises.sum1(15, 15) == 30)
        }

        'test_sum3 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(-1, 2) == 1)
            assert(Exercises.sum1(1, -1) == 0)
        }
    }
}
