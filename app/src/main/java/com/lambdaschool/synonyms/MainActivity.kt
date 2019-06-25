package com.lambdaschool.synonyms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val synonyms = arrayOf(
            arrayOf("swift", "abrupt", "expeditious", "hasty", "nimble", "quick", "rapid", "speedy", "sudden", "unexpected"),
            arrayOf("objective", "detached", "disinterested", "dispassionate", "equitable", "evenhanded", "nonpartisan", "open-minded", "unbiased"),
            arrayOf("calculate", "adjust", "appraise", "consider", "count", "determine", "forecast", "gauge", "guess", "measure", "multiply", "reckon", "subtract", "tally", "weigh", "work out"),
            arrayOf("create", "build", "conceive", "constitute", "construct", "design", "devise", "discover", "establish", "forge", "form"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        search_button.setOnClickListener {
            val target = input_text.text.toString().toLowerCase()
            val results = synonyms(target)
            if (results != null) {
                val output = StringBuilder()
                for (word in results) {
                    if (word != target) {
                        output.append(word).append(" ")
                    }
                }
                output_view.text = output.toString()
            } else {
                output_view.setText(R.string.no_synonyms)
            }
        }
    }

    private fun synonyms(target: String): Array<String>? {
        var returnList: Array<String>? = null

        for (strings in synonyms) {
            if (strings[0].toLowerCase() == target) {
                returnList = strings
            }
        }

        return returnList
    }

}
