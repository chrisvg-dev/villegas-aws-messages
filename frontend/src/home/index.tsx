import React from 'react';
import ReactDOM from 'react-dom/client';

export const Message = () => {
    const url = 'http://localhost:9090/api/messages';

    const sendMessage = async () => {
        await fetch(url)
            .then( response => response.json() )
            .then( jsonResponse => alert(jsonResponse.message) );
    }

    return (
        <>
            <section className='container'>
                <h1>Envia SMS a los dispositivos registrados</h1>
                <input 
                    onKeyUp={ evt => {
                        if (evt.key === 'Enter') sendMessage(); 
                    } } 
                    className='form-control' 
                    type="text" 
                    placeholder='Ingresa el mensaje' />
            </section>
        </>
    );
}