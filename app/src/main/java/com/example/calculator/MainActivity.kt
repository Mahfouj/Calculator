package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.delete.setOnClickListener {
            binding.inputtext.text= ""
            binding.outputtext.text= ""
        }
        binding.clu0.setOnClickListener {
            binding. inputtext.append("0")
        }
        binding.clu1.setOnClickListener {
            binding.inputtext .append("1")
        }
        binding.clu2.setOnClickListener {
            binding.inputtext .append("2")
        }

        binding.clu3.setOnClickListener {
            binding.inputtext .append("3")
        }

        binding.clu4.setOnClickListener {
            binding.inputtext .append("4")
        }
        binding.clu5.setOnClickListener {
            binding. inputtext.append("5")
        }

        binding.clu6.setOnClickListener {
            binding. inputtext.append("6")
        }
        binding.clu7.setOnClickListener {
            binding. inputtext.append("7")
        }
        binding.clu8.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.clu9.setOnClickListener {
            binding.inputtext.append("9")
        }

        binding.Dot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.pales.setOnClickListener {

            binding.inputtext.append("+")
        }

        binding.minas.setOnClickListener {

            binding.inputtext.append("-")
        }

        binding.multiply.setOnClickListener {

            binding.inputtext.append("*")
        }

        binding.divider.setOnClickListener {

            binding.inputtext.append("/")
        }

        binding.fastbraket.setOnClickListener {

            binding.inputtext.append(")")
        }

        binding.secandebraket.setOnClickListener {

            binding.inputtext.append("(")
        }

        binding.pdm1.setOnClickListener {

            binding.inputtext.append("+/-")
        }


        binding.equle.setOnClickListener {

            val expression= ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result=expression.evaluate()
            val longresult= result.toString()

            if (result==longresult.toDouble()) {
                binding.outputtext.text=longresult.toString()

            }else {
                binding.outputtext.text=result.toString()
            }
        }


    }
}