package leidinys;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LeidiniaiController {

	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private LeidiniaiRepository leidiniaiRepository;	
	
    @GetMapping("/leidiniai")
    public String patiekalai(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	
        model.addAttribute("leidiniai", leidiniaiRepository.findAll() );
        return "leidiniai";
    }  
    
	@PostMapping(path="/set") // Map ONLY GET Requests
	public String leidinio (@RequestParam Integer id, @RequestParam String pav
			, @RequestParam String vieta
			, @RequestParam String data
			, @RequestParam String leidykla
			, @RequestParam String kalba
			, @RequestParam String kodai
			, @RequestParam String apie		
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Leidiniai n = new Leidiniai();
		
		if ( id > 0 ) {
			
			Optional<Leidiniai> opt_leidiniai =leidiniaiRepository.findById(id);
			
			if ( ! opt_leidiniai.isEmpty() ) {
				
				n = opt_leidiniai.get();
			}
		}
		n.setPav(pav);
		n.setData(data);
		n.setVieta(vieta);
		n.setLeidykla(leidykla);
		n.setKalba(kalba);
		n.setKodai(kodai);
		n.setApie(apie);
		System.out.println (n.toString() );
		leidiniaiRepository.save(n);
		return "redirect:leidiniai";
	}	
}
