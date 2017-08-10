package blogProject.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/audit")
public class AudiController {
    
    /**
     * 主播审核流程
     * @return
     */
    @RequestMapping("/audi-anchor")
    public String anchorAudi() {
        return "audimanager/anchor-audi";
    }
    
    /**
     * 音频审核流程
     * @return
     */
    @RequestMapping("/audi-audio")
    public String audioAudi() {
        return "audimanager/audio-audi";
    }
    
    /**
     * 栏目审核流程
     * @return
     */
    @RequestMapping("/audi-column")
    public String columnAudi() {
        return "audimanager/column-audi";
    }
}
