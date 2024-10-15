package ibanez.pppb1.tugasp7pppb1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ibanez.pppb1.tugasp7pppb1.databinding.ActivityMainBinding
import ibanez.pppb1.tugasp7pppb1.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnRegister.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val intent = Intent(requireActivity(), HomepageActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", username)
            startActivity(intent)
        }
        return view
    }
}