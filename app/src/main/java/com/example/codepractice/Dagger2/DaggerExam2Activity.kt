package com.example.codepractice.Dagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.codepractice.R
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.android.synthetic.main.activity_dagger_exam1.*
import javax.inject.Inject


/* 참고문서
   https://medium.com/@elye.project/dagger-2-for-dummies-in-kotlin-provides-and-module-b84dca1b0d03
 */
class DaggerExam2Activity : AppCompatActivity() {
    @Inject lateinit var info: Info2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_exam2)
        DaggerMagicBox2.create().poke(this)
        exam_1.text = info.text
    }
}


/* class Info2 @Inject constructor(val text: String)
   생성자 @Inject를 이제 지워도 되!!
 */
class Info2(val text: String)


/*@Component(modules = [Bag::class, OtherBag::class, MoreBag::Class]) 가능 */
@Component(modules = [Bag::class])
interface MagicBox2 {
    /* Hey! I want a little magic box that does the magic instantiating my member variable. */
    fun poke(app: DaggerExam2Activity)
}

@Module
class Bag {
    @Provides
    open fun sayLoveDagger2(): Info2 {
        /* Module is used just like a bag, used to store a repository of provided object for Injection */
        /* Provides  is used to define a function that return this newly created class and lives in Module */
        /* module을 만들었으면 component에 어노테이션 추가해줘 */
        return Info2("Love Dagger 2")
    }
}
