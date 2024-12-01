<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>

let onFetchMainPhpCompleted = (response) => {
    if (response.ok) {
        response.text().then((data) => {
            console.log(data);
        });
    } else {
        console.log("Erro ao buscar os dados.");
    }
}

let onBtnClickFunction = () => {
        const button = document.getElementById('btn');
        button.innerText = "Carregando...";
        fetch('main.php')
            .then(onFetchMainPhpCompleted)
            .catch((error) => {
                console.error("Erro na requisição:", error);
            })
            .finally(() => {
                button.innerText = "Click Me";
            });
    }

    let myOnLoadFunction = () => {
        document.getElementById('btn').addEventListener('click', onBtnClickFunction);    
    }
    </script>
</head>
<body onload="myOnLoadFunction()">
    <h1>Hello World</h1>
    <button id="btn">Click Me</button>
</body>
</html>