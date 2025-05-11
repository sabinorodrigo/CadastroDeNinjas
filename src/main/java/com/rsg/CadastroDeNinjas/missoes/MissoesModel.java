package com.rsg.CadastroDeNinjas.missoes;

import com.rsg.CadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;
    private NinjaModel ninja;
}
