/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinho_cesar;

/**
 *
 * @author Erick
 */
public class Main {
    public static void main(String[] args)throws Exception {
        ApiGet apiget = new ApiGet();
        ApiPost apipost = new ApiPost();
        JsonParse jparse= new JsonParse();
       
        //jparse.parseJson(apiget.apiGetResp());
        //jparse.parseJson(apiget.apiGetResp());
        //System.out.println(jparse.parseJson(apiget.apiGetResp()));
        apipost.sendPost(jparse.parseJson(apiget.apiGetResp()));
        //System.out.println(jparse.parseJson());
    }
    
}
/*
token = a4d944dd47ea6faba16e39103cd132be80a5a939
    Regras

    As mensagens serão convertidas para minúsculas tanto para a criptografia quanto para descriptografia.
    No nosso caso os números e pontos serão mantidos, ou seja:

Normal: 1a.a

Cifrado: 1d.d

Escrever programa, em qualquer linguagem de programação, que faça uma requisição HTTP para a url abaixo:

https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=SEU_TOKEN

O resultado da requisição vai ser um JSON conforme o exemplo:

{
	"numero_casas": 10,
	"token":"token_do_usuario",
	"cifrado": "texto criptografado",
	"decifrado": "aqui vai o texto decifrado",
	"resumo_criptografico": "aqui vai o resumo"
}

O primeiro passo é você salvar o conteúdo do JSON em um arquivo com o nome answer.json, que irá usar no restante do desafio.

Você deve usar o número de casas para decifrar o texto e atualizar o arquivo JSON, no campo decifrado. O próximo passo é gerar um resumo criptográfico do texto decifrado usando o algoritmo sha1 e atualizar novamente o arquivo JSON. OBS: você pode usar qualquer biblioteca de criptografia da sua linguagem de programação favorita para gerar o resumo sha1 do texto decifrado.

Seu programa deve submeter o arquivo atualizado para correção via POST para a API:

https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=SEU_TOKEN

OBS: a API espera um arquivo sendo enviado como multipart/form-data, como se fosse enviado por um formulário HTML, com um campo do tipo file com o nome answer. Considere isso ao enviar o arquivo.

O resultado da submissão vai ser sua nota ou o erro correspondente. Você pode submeter quantas vezes achar necessário, mas a API não vai permitir mais de uma submissão por minuto.
OBS

Neste estágio da aceleração não solicitamos que você nos envie o código do programa que você criou, mas recomendamos que você guarde uma cópia pois o mesmo pode ser solicitado nas próximas fases do processo.

*/