package com.unicaldas.petitspotins

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmento: View = inflater.inflate(R.layout.fragment_detail, container, false)
        var codiven = requireArguments().getString("codigoVenta")
        var codivende = requireArguments().getString("codigoVendedor")
        var fechaven = requireArguments().getString("fechaVenta")
        var namecli = requireArguments().getString("nombreCliente")
        var fechcli = requireArguments().getString("fechaCliente")
        var tipocor = requireArguments().getString("tipoCortina")
        var largocor = requireArguments().getString("largoCortina")
        var anchocor = requireArguments().getString("anchoCortina")
        var areacor = requireArguments().getString("areaCortina")
        var cuotacor = requireArguments().getString("cuotaCortina")
        var abonocor = requireArguments().getString("abonoCortina")
        var saldopendi = requireArguments().getString("saldoPendiente")
        var saldotot = requireArguments().getString("saldoTotal")

        val textViewCodVen: TextView = fragmento.findViewById(R.id.textViewCodVen)
        val textViewCodVende: TextView = fragmento.findViewById(R.id.textViewCodVende)
        val textViewFechVen: TextView = fragmento.findViewById(R.id.textViewFechVen)
        val textViewNameClient:TextView =fragmento.findViewById(R.id.textViewNameClient)
        val textViewFechClient: TextView = fragmento.findViewById(R.id.textViewFechClient)
        val textViewTipoCor: TextView = fragmento.findViewById(R.id.textViewTipoCor)
        val textwViewLargo: TextView = fragmento.findViewById(R.id.textwViewLargo)
        val textViewAncho:TextView =fragmento.findViewById(R.id.textViewAncho)
        val textViewArea: TextView = fragmento.findViewById(R.id.textViewArea)
        val textViewCuotas: TextView = fragmento.findViewById(R.id.textViewCuotas)
        val textViewAbono: TextView = fragmento.findViewById(R.id.textViewAbono)
        val textViewSaldoPen:TextView =fragmento.findViewById(R.id.textViewSaldoPen)
        val textViewSaldoTotal: TextView = fragmento.findViewById(R.id.textViewSaldoTotal)

        textViewCodVen.text = codiven
        textViewCodVende.text = codivende
        textViewFechVen.text = fechaven
        textViewNameClient.text = namecli
        textViewFechClient.text = fechcli
        textViewTipoCor.text = tipocor
        textwViewLargo.text = largocor
        textViewAncho.text = anchocor
        textViewArea.text = areacor
        textViewCuotas.text = cuotacor
        textViewAbono.text = abonocor
        textViewSaldoPen.text = saldopendi
        textViewSaldoTotal.text = saldotot

        return fragmento
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}