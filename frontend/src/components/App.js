import React from "react";
import ReactDOM from "react-dom";

import DataProvider from "./DataProvider";
import Table from "./Table";

// ボタン追加
import Button1 from "./Button1"

const App = () => (
<DataProvider endpoint="counter/selectall" 
                render={data => <Table data={data} />
}
/>
);
const wrapper = document.getElementById("app");
wrapper ? ReactDOM.render(<App />, wrapper) : null;

const button1 = document.getElementById("button1");
button1 ? ReactDOM.render(<Button1 />, button1) : null;
