package br.com.erudio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Greeting {

    private final long id;
    private final String content;
}