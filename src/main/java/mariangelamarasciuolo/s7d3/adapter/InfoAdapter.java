package mariangelamarasciuolo.s7d3.adapter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@NoArgsConstructor
@Component
public class InfoAdapter extends UserData{

    private Info info;

    public InfoAdapter(Info info){
        this.info = info;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " +  this.info.getCognome();
    }

    @Override
    public int getEta() {
        return LocalDate.now().minusYears(info.getDataDiNascita().getYear()).getYear();
    }
}
