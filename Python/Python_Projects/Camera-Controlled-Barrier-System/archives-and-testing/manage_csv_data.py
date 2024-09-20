import pandas as pd

def extractAuthorizedVehiclesData():

    vehicle_numbers = dict()

    try:

        records_data_frame = pd.read_csv('../records/authorized_vehicles_data.csv')

        # print(records_data_frame.head())

        # vehicle_numbers = records_data_frame.loc[:, "Vehicle Number"]

        # print(records_data_frame.columns)

        for i, row in records_data_frame.iterrows():

            v_num = row["Vehicle Number"]
            v_type = row["Vehicle Type"]
            v_owner_name = row["Vehicle Owner Name"]

            vehicle_numbers[v_num] = (v_type, v_owner_name)

        return vehicle_numbers

    except(FileNotFoundError) as e:
            
            print(f"File Not Found! {e}")

            return None

if __name__ == "__main__":

    auth_vehicles_data = extractAuthorizedVehiclesData()

    if "MH03CR7777" in auth_vehicles_data:

        print("Found!")