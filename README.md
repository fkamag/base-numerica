# Desafio 08 - Base Numérica

### Problema
Implemente um algoritmo que realize a conversão de uma base numérica para outra

### Etapas
- Implementar as conversões de uma base para outra no estudo do `Caso 1`
- Implementar o mesmo para o estudo do `Caso 2`
- Cada etapa implementada vale `+ 0.5 pontos extras`

### Recomendações
- Temos aqui 8 bases com 56 conversões possíveis com `n(n−1) = 8(8-1) = 56`, então vamos simplificar
- Implemente as conversões diretas entre as bases para cada caso caindo parade `n(n−1) = 4(4-1) = 12`

# Caso 1
### Contexto
- A base decimal representa números em nosso cotidiano
- A base binária é a base fundamental para o funcionamento interno de computadores.
- A base octal compacta a representação números binários devido à relação direta com potências de 2
- A base hexadecimal é mais compacta ainda e também fácil de converter para binário
### Problema
- Implementar um conversor entre as unidades citadas
- Etapa 1: Decimal → Binário + Octal + Hexadecimal
- Etapa 2: Binário → Decimal + Octal + Hexadecimal
- Etapa 3: Octal → Decimal + Binário + Hexadecimal
- Etapa 4: Hexadecimal → Decimal + Binário + Octal

# Caso 2
### Contexto
- A base quinária (5) é representada por `{0, 1, 2, 3, e 4}` e usada em casos específicos de compactação
    - Exemplo: 103 (em quinário) = 1 * 5^2 + 0 * 5^1 + 3 * 5^0 = 28 (em decimal).
- A base duodecimal (12) possui intervalos `0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A (10), B (11)`
    - Exemplo: 1A (em duodecimal) = 1 * 12^1 + 10 * 12^0 = 22 (em decimal).
- A base vigesimal (20) representados com os dígitos `0-9 e A-J` (ou outros caracteres, dependendo da convenção)
    - Exemplo: 15 (em vigesimal) = 1 * 20^1 + 5 * 20^0 = 25 (em decimal).
- Por último a base sexagesimal (60) é muito usada para medições de tempo com dígitos de `0-9 e outros símbolos`.
    - Exemplo: 2:30 (em sexagesimal) representa 2 horas e 30 minutos.
### Problema
- Implementar um conversor entre as unidades citadas
- Etapa 1: Quinária → Duodecimal + Vigesimal + Sexagesimal
- Etapa 2: Duodecimal → Quinária + Vigesimal + Sexagesimal
- Etapa 3: Vigesimal → Quinária + Duodecimal + Sexagesimal
- Etapa 4: Sexagesimal → Quinária + Duodecimal + Vigesimal

### Bases Referências
- [Decimal](https://dev.to/womakerscode/bases-numericas-decimal-i3a) + [Binária](https://dev.to/womakerscode/bases-numericas-binario-31de) + [Octal](https://dev.to/womakerscode/bases-numericas-octal-28h9) + [Hexadecimal](https://dev.to/womakerscode/bases-numericas-hexadecimal-3ldn)
- [Quinária](https://pt.wikipedia.org/wiki/Sistema_de_numera%C3%A7%C3%A3o_quin%C3%A1rio) + [Duodecimal](https://pt.wikipedia.org/wiki/Sistema_de_numera%C3%A7%C3%A3o_duodecimal) + [Vigesimal](https://pt.wikipedia.org/wiki/Sistema_de_numera%C3%A7%C3%A3o_vigesimal) + [Sexagesimal](https://pt.wikipedia.org/wiki/Sistema_de_numera%C3%A7%C3%A3o_sexagesimal)
