package com.jcm.banco.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_news")
public class News extends BaseItem{
}
