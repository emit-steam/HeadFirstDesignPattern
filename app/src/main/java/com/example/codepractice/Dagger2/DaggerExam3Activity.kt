package com.example.codepractice.Dagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.codepractice.R
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.android.synthetic.main.activity_dagger_exam3.*
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Qualifier


/* 참고문서
   https://medium.com/@elye.project/dagger-2-for-dummies-in-kotlin-provides-and-module-b84dca1b0d03
 */
const val LOVE = "Love"
const val HELLO = "Hello"
class DaggerExam3Activity : AppCompatActivity() {
    @Inject @field:Choose(LOVE) lateinit var infoLove: Info3
    @Inject @field:Choose(HELLO) lateinit var infoHello: Info3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_exam3)
        DaggerMagicBox3.create().poke(this)
        exam_1.text = infoLove.text
        exam_2.text = infoHello.text
    }
}

class Info3(val text: String)

@Component(modules = [Bag3::class])
interface MagicBox3 {
    fun poke(app: DaggerExam3Activity)
}

@Module
class Bag3 {
    @Provides @Choose(LOVE)
    fun sayLoveDagger3(): Info3 {
        return Info3("Love Dagger 2")
    }

    @Provides @Choose(HELLO)
    fun sayHelloDagger3(): Info3 {
        return Info3("Hello Dagger2")
    }
}

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Choose(val value: String = "")
/* JAVA로 짜면 @Choose가 아닌 @Named 로해야해
    @Qualifier
    @Documented
    @Retention(RUNTIME)
    public @interface Named {
    /** The name. */
        String value() default "";
    }
 */