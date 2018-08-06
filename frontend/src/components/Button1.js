import React from 'react';
import Button from '@material-ui/core/Button';

const Button1 = () => (
    <Button variant="contained" color="primary" onClick={() => { click_button(); }}>Hello World</Button>
);

const click_button = () => (
    //console.log('onClick')
    window.alert('onClick')
);

export default Button1;
