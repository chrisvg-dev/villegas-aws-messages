import React from 'react';
import ReactDOM from 'react-dom/client';

export const Message = () => {
    const sendMessage = () => {
        alert('Click we');
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