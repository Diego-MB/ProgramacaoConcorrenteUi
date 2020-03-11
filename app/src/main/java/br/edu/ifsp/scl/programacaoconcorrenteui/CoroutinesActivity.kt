package br.edu.ifsp.scl.programacaoconcorrenteui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_coroutines)
        supportActionBar?.title = "Coroutines"
    }

    override fun run() {

        GlobalScope.launch(Dispatchers.Main) {

            Thread.sleep(Constantes.CARREGA_IMAGENS_DELAY)

            altaIv.setImageResource(R.drawable.android_preto)
            baixaIv.setImageResource(R.drawable.android_verde)
        }

    }

}
