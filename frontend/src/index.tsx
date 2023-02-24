import React from 'react';
import ReactDOM from 'react-dom/client';
import { Message } from './home';

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <Message />
);
