package com.example.codepractice.Dagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.codepractice.R
import dagger.Component
import kotlinx.android.synthetic.main.activity_dagger_exam1.*
import javax.inject.Inject


/* 참고문서
   https://medium.com/@elye.project/dagger-2-for-dummies-in-kotlin-with-one-page-simple-code-project-618a5f9f2fe8
 */
class DaggerExam1Activity : AppCompatActivity() {
    @Inject lateinit var info: Info1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_exam1)
        DaggerMagicBox1.create().poke(this)
        exam_1.text = info.text
    }
}


class Info1 @Inject constructor() {
    val text = "Hello Dagger2"
}


@Component
interface MagicBox1 {
    /* Hey! I want a little magic box that does the magic instantiating my member variable. */
    fun poke(app: DaggerExam1Activity)
}