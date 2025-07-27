import { CalculateScore } from "./components/CalculateScore";

function App() {
    return (
        <div>
            <CalculateScore 
                Name={"Steve"}
                School={"DNV Public School"}
                total={284}
                goal={300}  // Corrected goal value (assuming it's out of 300)
            />
        </div>
    );
}

export default App;